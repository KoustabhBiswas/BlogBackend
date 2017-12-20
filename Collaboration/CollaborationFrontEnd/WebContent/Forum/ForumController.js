app.controller('ForumController',[
				'ForumService',
				'$http',
				'$scope',
				'$rootScope',
				'$location',
				'$cookieStore',
				function(ForumService,$http, $scope,$rootScope,$location,$cookieStore){
					var self = this;
					self.forum = {};
					self.addForum = function(){
						ForumService.addForum(self.forum).then(function(response){
							//self.forum = response;
							$location.path("/forum");
						},function(error){
							alert("Error");
						});
					}
					 
				}
])