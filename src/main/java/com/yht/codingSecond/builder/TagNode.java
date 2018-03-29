package com.yht.codingSecond.builder;

import java.util.ArrayList;
import java.util.List;

public class TagNode {
    private String tagName;
    private String tagValue;
    private List<TagNode> children = new ArrayList<>();
    private List<Attribute> attributes = new ArrayList<>();

    public TagNode(String tagName) {
        this.tagName = tagName;
    }

    public void addAttribute(String attributeName, String attributeValue) {
        Attribute attribute = new Attribute(attributeName, attributeValue);
        attributes.add(attribute);
    }

    public void addChild(TagNode child) {
        children.add(child);
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagValue() {
        return tagValue;
    }

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    private static class Attribute{
        public Attribute(String name, String value) {
            this.name = name;
            this.value = value;
        }
        String name;
        String value;
    }

    public String toXml() {
        StringBuilder builder = new StringBuilder();
        builder.append(" <" + this.tagName);
        if(attributes.size() > 0) {
            for(Attribute attribute : attributes) {
                builder.append(toXml(attribute));
            }
        }
        if(children.size()== 0){
            builder.append("/>");
            return builder.toString();
        }
        builder.append(">");

        if(this.tagValue != null) {
            builder.append(" " + tagValue);
        }
        for(TagNode tagNode : children) {
            builder.append(tagNode.toXml());
        }


        builder.append(" </" + this.tagName + ">");

        return builder.toString();
    }

    public String toXml(Attribute attribute) {
        return " " + attribute.name + "=\"" + attribute.value + "\"";
    }

}
