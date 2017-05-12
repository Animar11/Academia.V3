'use strict';

/**
 * @ngdoc overview
 * @name webAppApp
 * @description
 * # webAppApp
 *
 * Main module of the application.
 */

var app = angular
    .module('webAppApp', [
    'ngAnimate',
    'ngAria',
    'ngCookies',
    'ngMessages',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch'
  ])

  app.config(function ($routeProvider, $locationProvider) {



    $routeProvider
      .when('/RepartitionEquipeEleve', {
          templateUrl : 'views/RepartitionEquipeEleve.html',
          controller : '',
          controllerAs:''
        })
      .when('/Session_equipe', {
        templateUrl : 'views/Session_equipe.html',
        controller : 'SEController',
        controllerAs:'vm'
      })
      .when('/PlanningRespo', {
        templateUrl : 'views/PlanningRespo.html',
        controller : ''
      })
      .when('/DepotEleve', {
        templateUrl : 'views/DepotEleve.html',
        controller : ''
      })
      .when('/PlanningVuEleve', {
        templateUrl : 'views/PlanningVuEleve.html',
        controller : ''
      })
      .when('/MurEleve', {
        url: 'MurEleve',
        views : 'MurEleve.html',
        templateUrl : 'views/MurEleve.html',
        controller : 'MurEController',
        controllerAs:'vm'
      })
      .when('/SujetEleve', {
        templateUrl : 'views/SujetEleve.html',
        controller : ''
      })
      .when('/UserManagement', {
        templateUrl : 'views/UserManagement.html',
        controller : 'UserManagement',
        controllerAs:'vm'
      })
      .when('/EquipeNom1', {
        templateUrl : 'views/EquipeNom1.html',
        controller : ''
      })
      .when('/MurRespo', {
        templateUrl : 'views/MurRespo.html',
        controller : ''
      })
      .when('/ConsultationDepotEleve', {
        templateUrl : 'views/ConsultationDepotEleve.html',
        controller : ''
      })
      .when('/Sujet', {
        templateUrl : 'views/Sujet.html',
        controller : ''
      })
      .when('/Equipe', {
        templateUrl : 'views/Equipe.html',
        controller : ''
      })
      .when('/GestionClients', {
        templateUrl : 'views/GestionClients.html',
        controller : ''
      })
      .when('/Planning', {
        templateUrl : 'views/Planning.html',
        controller : ''
      })
      .when('/PlanningClient', {
        templateUrl : 'views/PlanningClient.html',
        controller : ''
      })
      .when('/menuEleve', {
        templateUrl : 'views/menuEleve.html',
        controller : ''
      })
      .when('/', {
        url: 'authentification',
        templateUrl: 'views/authentification.html',
        controller: '',
        //controllerAs: 'authentification'
      })
      .when('/authentification', {
        url: 'authentification',
        templateUrl: 'views/authentification.html',
        controller: '',
        //controllerAs: 'authentification'
      })
      .when('/about', {
        url: 'about',
        views: 'about.html',
        templateUrl: 'views/about.html',
       controller: 'AboutCtrl',
        controllerAs: 'about'
      })
      .when('/main', {
       url: 'main',
       views : 'main.html',
       templateUrl: 'views/main.html',
       controller: 'MainCtrl',
       controllerAs: 'main'
      })

      .otherwise({
        redirectTo: ''
      });


  });

 app.config(['$locationProvider', function($locationProvider) {
  $locationProvider.hashPrefix('');
}]);

 app.controller('academia', function($scope, random){
  $scope.generate
 });
