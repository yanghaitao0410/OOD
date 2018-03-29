package com.yht.codingSecond.prototype;

public class Company implements Cloneable{
    private String companyName;

    public Company(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 这里复写clone方法是为了可以在其他类中使用，因为该方法是protected类型，
     * 与Object同包或Object子类中可以使用，其他类不可使用
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
