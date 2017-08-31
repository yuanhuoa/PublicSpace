var loginDirective = angular.module('loginDirective',[]);

loginDirective.directive('spaceLogin',function () {
    return{
        restrict:'E',
        scope:true,
        replace:true,
        templateUrl:"../webpage/spaceLogin.html",
        link:function($scope,elm,attr,controller){
            console.log("这是link");
        }
    }
})