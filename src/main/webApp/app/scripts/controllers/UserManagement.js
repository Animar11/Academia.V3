(function(){
    'use strict';

    angular.module('webAppApp')
        .controller('UserManagement', UserManagement);

    UserManagement.$inject=['$scope','UserManagementService'];

    function UserManagement($scope,UserManagementService){
        var vm=this;
        vm.save=save;
        vm.clear=clear;
        UserManagementService.query().$promise.then(function(result) {
                vm.persons = result;
            }
        );
        function clear(){
            UserManagementService.query().$promise.then(function(result) {
                    vm.persons = result;
                }
            );
        }//pas le meilleur moyen pour reset les valeurs mais pas le temps
        function onSaveSuccess (result) {
            vm.isSaving = false;
        }

        function onSaveError () {
            vm.isSaving = false;
        }

        function save () {
            vm.isSaving = true;
            if (vm.persons.id !== null) {
                UserManagementService.update(vm.persons, onSaveSuccess, onSaveError);
            } else {
                UserManagementService.save(vm.persons, onSaveSuccess, onSaveError);
            }
        }
    }


})();
