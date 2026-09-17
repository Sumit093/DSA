/**
 * @param {number[]} cost
 * @return {number}
 */
var minCostClimbingStairs = function(cost) {
    let ans=0;
    let arr=[];
    if(cost.length==2){
        if(cost[0]<cost[1]){
            return cost[0];
        }
        else {
            return cost[1]
        }
        
    } 

    let a=cost[0];
    arr.push(a);
    let b=cost[1];
    arr.push(b);
    for(let i=2;i<cost.length;i++){
        arr[i]=Math.min(arr[i-1],arr[i-2])+cost[i];
    
    }
    return Math.min(arr[cost.length-1],arr[cost.length-2]);
};