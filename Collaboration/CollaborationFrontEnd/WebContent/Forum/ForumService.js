app.service('ForumService',[
	         '$http',
	         '$q',
	         '$rootScope',
	         function($http, $q, $rootScope){
	        	 this.addForum = function(forum){
	        		 var defer = $q.defer();
	        		 $http.post('http://localhost:9855/Collaboration_Back/addforum' , forum).then(function(response){
	        			 defer.resolve(response.data);
	        		 },function(error){
	        			 defer.reject();
	        		 });
	        		 return defer.promise;
	        	 }
	         }
])