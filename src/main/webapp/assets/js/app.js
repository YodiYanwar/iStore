angular.module('iStore', ['ngRoute', 'iStore.controller', 'ngAnimate'])

    .config(['$routeProvider', function($routeProvider){
      $routeProvider
        .when('/', {
          templateUrl : 'pages/dashboard.html'
        })
        .when('/barang', {
          templateUrl : 'pages/barang.html',
          controller  : 'BarangController'
        })
        .when('/pelanggan', {
          templateUrl : 'pages/pelanggan.html',
          controller  : 'PelangganController'
        })
        .when('/transaksi', {
          templateUrl : 'pages/transaksi.html',
          controller  : 'TransaksiController'
        })
    }])

    .run(['$rootScope', '$location', function($rootScope, $location) {
      $rootScope.goto = function(path) {
        $location.path(path);
      }
    }])
;
