/**
 * 
 */

var cliente = angular.module('Clientes', [ 'ngRoute', 'ngCookies' ]);

cliente.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/', {
		templateUrl : 'login.html',
		controller : 'ContLogin'
	});
} ]);

cliente.controller('ContLogin', function($scope) {

});