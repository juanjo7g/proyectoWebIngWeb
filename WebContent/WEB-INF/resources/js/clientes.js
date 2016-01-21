/**
 * 
 */

var cliente = angular.module('Clientes', ['ngRoute', 'ngCookies']);

cliente.constant(['routerProvider',	function($routerProvider) {
	$routerProvider.when('/',{
		templateUrl: ""
	})
]});