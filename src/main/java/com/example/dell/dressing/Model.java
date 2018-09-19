package com.example.dell.dressing;

import java.nio.FloatBuffer;

public class Model {

    //三角面个数
    private int facetCount;
    //顶点坐标数组
    private float[] verts;
    //每个顶点对应的法向量数组
    private float[] vnorms;
    //每个三角面的属性信息
    private short[] remarks;

    //纹理图片
    private String pictureName;

    //纹理ID
    int[] textureIds;

    //每个顶点对应图片的坐标位置
    private float[] textures;

    //顶点数组转换而来的Buffer
    private FloatBuffer vertBuffer;

    //每个顶点对应的法向量转换而来的Buffer
    private FloatBuffer vnormBuffer;

    //每个顶点对应的纹理坐标转换而来的Buffer
    private FloatBuffer textureBuffer;

    //以下分别保存所有点在x,y,z方向上的最大值、最小值
    float maxX;
    float minX;
    float maxY;
    float minY;
    float maxZ;
    float minZ;

    //返回模型的中心点
    //注意，下载的源码中，此函数修改修正如下
//    public Point getCentrePoint() {
//
//        float cx = minX + (maxX - minX) / 2;
//        float cy = minY + (maxY - minY) / 2;
//        float cz = minZ + (maxZ - minZ) / 2;
//        return new Point(cx, cy, cz);
//    }

    //包裹模型的最大半径
    public float getR() {
        float dx = (maxX - minX);
        float dy = (maxY - minY);
        float dz = (maxZ - minZ);
        float max = dx;
        if (dy > max)
            max = dy;
        if (dz > max)
            max = dz;
        return max;
    }

    public void setTextures(float[] textures) {
        this.textures = textures;
        textureBuffer = Util.floatToBuffer(textures);
    }

    //设置顶点数组的同时，设置对应的Buffer
    public void setVerts(float[] verts) {
        this.verts = verts;
        vertBuffer = Util.floatToBuffer(verts);
    }

    //设置顶点数组法向量的同时，设置对应的Buffer
    public void setVnorms(float[] vnorms) {
        this.vnorms = vnorms;
        vnormBuffer = Util.floatToBuffer(vnorms);
    }

    public FloatBuffer getVnormBuffer() {
        return vnormBuffer;
    }

    public FloatBuffer getVertBuffer() {
        return vertBuffer;
    }

    public int getFacetCount() {
        return facetCount;
    }

    public void setFacetCount(int faceCount) {
        this.facetCount = faceCount;
    }

    public short[] getRemarks() {
        return remarks;
    }

    public void setRemarks(short[] remarks) {
        this.remarks = remarks;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public void setTextureIds(int[] textureIds) {
        this.textureIds = textureIds;
    }

    public int[] getTextureIds() {
        return textureIds;
    }

    public FloatBuffer getTextureBuffer() {
        return textureBuffer;
    }



    //···
    //其他属性对应的setter、getter函数
    //···
}
