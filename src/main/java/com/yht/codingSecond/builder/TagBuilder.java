package com.yht.codingSecond.builder;

public class TagBuilder {
    TagNode root;
    TagNode curNode;
    TagNode parentNode;

    public TagBuilder(String tagName) {
        root = new TagNode(tagName);
        curNode = root;
        parentNode = null;
    }

    public TagBuilder tagValue(String tagValue) {
        root.setTagValue(tagValue);
        return this;
    }

    public TagBuilder addChild(String tagName) {
        return addChild(buildNode(tagName));
    }

    public TagBuilder addChild(TagNode tagNode) {
        curNode.addChild(tagNode);
        parentNode = curNode;
        curNode = tagNode;
        return this;
    }

    /**
     * 增加节点属性
     * @param attributeName 属性名
     * @param attributeValue 属性值
     * @return
     */
    public TagBuilder setAttribute(String attributeName, String attributeValue) {
        curNode.addAttribute(attributeName, attributeValue);
        return this;
    }

    /**
     * 增加兄弟节点
     * @param tagName 节点名称
     * @return
     */
    public TagBuilder addSibling(String tagName) {
        return addSibling(buildNode(tagName));
    }

    /**
     * 增加兄弟节点
     * @param tagNode 节点
     * @return
     */
    public TagBuilder addSibling(TagNode tagNode) {
        parentNode.addChild(tagNode);
        curNode = tagNode;
        return this;
    }

    private TagNode buildNode(String tagName) {
        return new TagNode(tagName);
    }

    public String toXML() {
        return root.toXml();
    }
}
