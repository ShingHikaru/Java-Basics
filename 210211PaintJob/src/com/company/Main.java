package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4,1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26,0.75));
    }

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBucket) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBucket < 0)) {
            return -1;
        }
        double areaNum = width * height;
        int bucketCount = (int) Math.ceil(areaNum / areaPerBucket) - extraBucket;

        return bucketCount;
    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        double areaNum = width * height;
        int bucketCount = (int) Math.ceil(areaNum / areaPerBucket);

        return bucketCount;
    }

    public static int getBucketCount (double area, double areaPerBucket) {
        if ((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        int bucketCount = (int) Math.ceil(area / areaPerBucket);
        return bucketCount;
    }

}
