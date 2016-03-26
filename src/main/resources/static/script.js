/**
 * Created by caneraydin on 16.03.2016.
 */
/**
 * Created by caneraydin on 16.03.2016.
 */
/**
 * Created by caneraydin on 16.03.2016.
 */
/**
 * Created by caneraydin on 16.03.2016.
 */
var app=angular.module('todoApp',[]);
app.controller('todoController',function($scope,$http,$window){

    $scope.addMovie=function(title,actor){
       //$window.alert("ititle actor "+title+actor)
      //  $scope.title="title clicked "+title;

      //  $scope.actor="actor clicked "+actor;

       // $scope.added="the movie '"+title+"' with those actor '"+actor+"' added successfully";

        $http({
            method: 'POST',
            headers: {
                "Authorization": "55d5927329415b000100003b63a9e1b480b64a1040a902a26da862d3",
                "Access-Control-Allow-Origin": "*",
                "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8"
            },
         
            url: 'http://localhost:8181/movies/add/'+title+"/"+actor
        }).then(function successCallback() {//$window.alert("in addmoviesuccess");
            //  $scope.check = response.data;

            //    $scope.names = response.data.title;

            $scope.listMovie();

        });

        //$window.alert("bitiste addmovie")
       // $scope.listMovie();
    },

        $scope.deleteMovie=function(id, index) {
            // $scope.id="id clicked "+id;


             //  $scope.deleted="the movie with id '"+id+"' deleted successfully";
        //    $window.alert("in deletemovie id"+id);

             $http({
             method: 'DELETE',
             headers: {
             "Authorization": "55d5927329415b000100003b63a9e1b480b64a1040a902a26da862d3",
             "Access-Control-Allow-Origin": "*",
             "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8"

             },
             url: 'http://localhost:8181/movies/delete/'+id
             }).then(function successCallback() {// $window.alert("in removemoviesuccess");

                 $scope.listMovie();

             })
        },
                 //    $scope.names = response.data.title;
//console.log(index)
             //    $scope.tasks.splice(index,1);

          //   })


            /* $http.get('http://localhost:8181/movies/remove/'+id).then(function(){

             $http.get('http://localhost:8181/movies/list').then(function successCallback(response) { $window.alert("in listmoviesuccess");
             //  $scope.check = response.data;
             console.log(response);
             $scope.tasks = response.data;
             //    $scope.names = response.data.title;

             }, function errorCallback(response) {$window.alert("in listmovie err");
             //  console.log(response);
             // $scope.check = response;

             }

             //$scope.listMovie();
             );});},*/

               //  );},
        $scope.editMovie=function(id){
            $scope.id="id clicked "+id;

            //  $scope.deleted="the movie with id '"+id+"' deleted successfully";
         //   $window.alert("in edittemovie id"+id);
            $http({
                method: 'PUT',
                headers: {
                    "Authorization": "55d5927329415b000100003b63a9e1b480b64a1040a902a26da862d3",
                    "Access-Control-Allow-Origin": "*",
                    "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8"

                },
                url: 'http://localhost:8181/movies/edit/'+id+title+actor
            }).then(function successCallback() {// $window.alert("in removemoviesuccess");
                //  $scope.check = response.data;

                //    $scope.names = response.data.title;

                $scope.listMovie();

            })
        },

        $scope.listMovie=function(){
      //      var list = 1
        //    $window.alert("in listmovie");
            $scope.check='NO';
        //    $scope.list="list clicked "+list;
         //   $window.alert(" listmovie "+list);
          // $scope.listed="the movies are listing: "+list;
            $http({
                method: 'GET',
                headers: {

                    "Authorization": "55d5927329415b000100003b63a9e1b480b64a1040a902a26da862d3",
                    "Access-Control-Allow-Origin": "*"
                },
                url: 'http://localhost:8181/movies/list'
            }).then(function successCallback(response) { //$window.alert("in listmoviesuccess");
              //  $scope.check = response.data;
                console.log(response);
              $scope.tasks = response.data;
            //    $scope.names = response.data.title;



            }, function errorCallback(response) {//$window.alert("in listmovie err");
              //  console.log(response);
               // $scope.check = response;
            }
            );

            //$window.alert("in listmovie end");
        };
    //$window.alert("after listmovieq");
    $scope.listMovie();

    //$window.alert("after listmovie");

});

