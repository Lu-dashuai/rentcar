package com.aaa.rent.service;

import com.aaa.rent.dao.PowerDao;
import com.aaa.rent.entity.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class PowerServiceImpl implements PowerService {
    @Autowired
    private PowerDao powerDao;
    /**
     *
     * @return
     */
    @Override
    public List<TreeNode> getPowerList() {
        // TODO Auto-generated method stub
        List<TreeNode> powerAllList = getPList();
        //临时的powerList
        List<TreeNode> powerTempList = new ArrayList<TreeNode>();
        //判断是否为空
        if(powerAllList!=null&&powerAllList.size()>0){
            for(TreeNode ptreeNode:powerAllList){
                if(ptreeNode.getPid()==0){//如果等于0,说明是一级节点
                    powerTempList.add(ptreeNode);
                    //递归绑定子节点,ptreeNode是所有的父节点
                    bindChirldren(ptreeNode,powerAllList);
                }
            }
        }
        return powerTempList;
    }

    @Override
    public List<Map> getPowerList1() {
        return powerDao.getTree();
    }

    /**
     * 毫无理由
     * @return
     */
    public List<TreeNode> getPList(){
        //查询数据
        List<Map> powerMapList = powerDao.getPList();
        //定义返回列表
        List<TreeNode> powerList = new ArrayList<TreeNode>();
        //判断是否为空
        if(powerMapList!=null&&powerMapList.size()>0){
            TreeNode treeNode = null;
            //循环遍历，构造TreeNode对象，加入powerList
            for(Map powerMap:powerMapList){
                String id = powerMap.get("id")+"";
                String name = powerMap.get("name")+"";
                String parentId = powerMap.get("parentid")+"";
                String state = powerMap.get("state")+"";
                String iconCls = powerMap.get("iconcls")+"";
                String url = powerMap.get("url")+"";
                String checked = powerMap.get("checked")+"";
                treeNode = new TreeNode(Integer.valueOf(id), name,Integer.valueOf(parentId), state, iconCls, url,checked);
                powerList.add(treeNode);
            }
        }
        return powerList;
    }
    /**
     * 递归绑定所有子节点
     * @param parentTreeNode
     * @param powerAllList
     */
    private  void bindChirldren(TreeNode parentTreeNode,List<TreeNode> powerAllList ){
        for(TreeNode chirldrenTreeNode:powerAllList){
            if(parentTreeNode.getId()==chirldrenTreeNode.getPid()){
                //获取当前节点的所有子节点集合
                List<TreeNode> children = parentTreeNode.getChildren();
                if(children==null){//如果孩子节点为空,
                    List<TreeNode> childrenTempList = new ArrayList<TreeNode>();//实例化孩子集合
                    childrenTempList.add(chirldrenTreeNode);//添加子节点到集合里面
                    parentTreeNode.setChildren(childrenTempList);//设置孩子集合
                }else{//不空，说明设置过
                    children.add(chirldrenTreeNode);//添加子节点到集合里面
                }
                //自己调用自己,找孩子
                bindChirldren(chirldrenTreeNode,powerAllList);
            }
        }
    }
}
