(function(){
	'use strict';

	angular.module('webAppApp')
	.controller('MurEController', MurEController);

	MurEController.$inject=['$scope'];

	function MurEController($scope){
		var vm=this;
		vm.check=false;
	}

})();
