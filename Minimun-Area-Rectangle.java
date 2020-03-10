class Solution {
    public int minAreaRect(int[][] points) {
      Map<Integer, HashSet<Integer>> map = new HashMap();
      int area = Integer.MAX_VALUE;

       //Map(x,[y1,y2,y3])
      for(int[] point: points){
          if(!map.containsKey(point[0]))
                map.put(point[0], new HashSet());
          map.get(point[0]).add(point[1]);

      }

        for(int[] pointA: points){
             for(int[] pointB: points){
                 //check if diagonal
                 if(pointA[0]==pointB[0] || pointA[1]==pointB[1])
                     continue;

                 if(!map.get(pointA[0]).contains(pointB[1]) || !map.get(pointB[0]).contains(pointA[1]) )
                     continue;

                 area = Math.min(area, Math.abs((pointB[0] - pointA[0])
                                        * (pointB[1] - pointA[1])));
             }
        }


        return area==Integer.MAX_VALUE? 0 : area;
    }

}
