angular.module('iStore.controller', [])

//=======================================================================================
//Barang Controller

  .controller('BarangController', ['$http', '$scope', function($http, $scope){

      $scope.showAllBarang = function(){
          $http.get('barang/barang.json')
            .success(function(response){
              $scope.barangs = response;
              $scope.total = response.length;
              //$scope.no = 0;
            });
      };

      $scope.tambahBrg = function(barang){
          $http.post('barang/add',barang)
            .success(function(response){
              $scope.showAllBarang();
            })
            .error(function(data, status, headers, config) {
              alert( "Exception details: " + JSON.stringify({data: data}));
            });
            /*console.log("Tambah Barang");
            console.log("Id Barang   : "+brg.idBarang);
            console.log("Nama Barang : "+brg.namaBrg);
            console.log("Satuan      : "+brg.satuan);
            console.log("Stok        : "+brg.stok);
            console.log("Kategori    : "+brg.kategori);
            console.log("Harga       : Rp."+brg.harga);
            console.log("Tgl Input   : "+brg.tglInput);
            console.log("Tgl Update  : "+brg.tglUpdate);
            */
      };

      $scope.tambahBrgModal = function(){
        $scope.brg.namaBrg = "";
        $scope.brg.satuan = "";
        $scope.brg.stok = "";
        $scope.brg.kategori = "";
        $scope.brg.harga = "";
        $scope.editMode = false;
      };

      $scope.hapus = function(id){
          $http.delete('barang/delete/'+id)
            .success(function(response){
              $scope.showAllBarang();
            });
      };

      $scope.editAct = function(brg){
          $http.put('barang/edit', brg)
            .success(function(){
              $scope.brg = brg;
              $scope.editMode = false;
              $scope.showAllbarang();
            })
            .error(function(data, status, headers, config) {
              alert( "Exception details: " + JSON.stringify({data: data}));
            });
            console.log("Edit Barang");
            console.log(brg);
      };

      $scope.edit = function(brg){
        $scope.brg = brg;
        $scope.editMode = true;
      };

      $scope.injectIndex = function(brg){
        var index = $scope.barangs.indexOf(brg);

        $scope.brg = brg;
        $scope.noIndex = index;
      };

      $scope.showAllBarang();
  }])

//End Of Barang Controller
//=======================================================================================

//=======================================================================================
//Pelanggan Controller

  .controller('PelangganController', ['$http', '$scope', function($http, $scope){

    $scope.showAllPelanggan = function(){
      $http.get('pelanggan/pelanggan.json')
      .success(function(response){
        $scope.pelanggans = response;
        $scope.total = response.length;
        //$scope.no = 0;
      });
    };

    $scope.tambahPlg = function(plg){
      $http.post('pelanggan/add',plg)
      .success(function(response){
        $scope.showAllPelanggan();
      })
      .error(function(data, status, headers, config) {
        alert( "Exception details: " + JSON.stringify({data: data}));
      });
      /*console.log("Tambah Barang");
      console.log("Id Barang   : "+brg.idBarang);
      console.log("Nama Barang : "+brg.namaBrg);
      console.log("Satuan      : "+brg.satuan);
      console.log("Stok        : "+brg.stok);
      console.log("Kategori    : "+brg.kategori);
      console.log("Harga       : Rp."+brg.harga);
      console.log("Tgl Input   : "+brg.tglInput);
      console.log("Tgl Update  : "+brg.tglUpdate);
      */
    };

    $scope.tambahPlgModal = function(){
      $scope.plg.namaPelanggan = "";
      $scope.plg.noTelp = "";
      $scope.plg.alamat = "";
      $scope.plg.jenisKelamin = "PILIH JENIS KELAMIN";
      $scope.brg.tglInput = "";
      $scope.editMode = false;
    };

    $scope.hapus = function(id){
      $http.delete('pelanggan/delete/'+id)
      .success(function(response){
        $scope.showAllPelanggan();
      })
      .error(function(data, status, headers, config) {
        alert( "Exception details: " + JSON.stringify({data: data}));
      });
    };

    $scope.editAct = function(plg){
      $http.put('pelanggan/edit', plg)
      .success(function(){
        $scope.plg = plg;
        $scope.editMode = false;
        $scope.showAllPelanggan();
      })
      .error(function(data, status, headers, config) {
        alert( "Exception details: " + JSON.stringify({data: data}));
      });
      console.log("Edit pelanggan");
      console.log(plg);
    };

    $scope.edit = function(plg){
      $scope.plg = plg;
      $scope.editMode = true;
    };

    $scope.injectIndex = function(plg){
      var index = $scope.pelanggans.indexOf(plg);

      $scope.plg = plg;
      $scope.noIndex = index;
    };

    $scope.showAllPelanggan();
  }])

//End Of Pelanggan Controller
//=======================================================================================

//=======================================================================================
//Transaksi Controller

  .controller('TransaksiController', ['$http', '$scope', function($http, $scope){

    $scope.showAllTransaksi = function(){
      $http.get('transaksi/transaksi.json')
      .success(function(response){
        $scope.transaksis = response;
        $scope.total = response.length;
        //$scope.no = 0;
      });
    };

    $scope.tambahPlg = function(trans){
      $http.post('transaksi/add',trans)
      .success(function(response){
        $scope.showAllTransaksi();
      })
      .error(function(data, status, headers, config) {
        alert( "Exception details: " + JSON.stringify({data: data}));
      });
      /*console.log("Tambah Barang");
      console.log("Id Barang   : "+brg.idBarang);
      console.log("Nama Barang : "+brg.namaBrg);
      console.log("Satuan      : "+brg.satuan);
      console.log("Stok        : "+brg.stok);
      console.log("Kategori    : "+brg.kategori);
      console.log("Harga       : Rp."+brg.harga);
      console.log("Tgl Input   : "+brg.tglInput);
      console.log("Tgl Update  : "+brg.tglUpdate);
      */
    };

    $scope.tambahTransModal = function(){
      $scope.editMode = false;
    };

    $scope.hapus = function(id){
      $http.delete('transaksi/delete/'+id)
      .success(function(response){
        $scope.showAllTransaksi();
      })
      .error(function(data, status, headers, config) {
        alert( "Exception details: " + JSON.stringify({data: data}));
      });
    };

    $scope.editAct = function(trans){
      $http.put('transaksi/edit', trans)
      .success(function(){
        $scope.trans = trans;
        $scope.editMode = false;
        $scope.showAllTransaksi();
      })
      .error(function(data, status, headers, config) {
        alert( "Exception details: " + JSON.stringify({data: data}));
      });
      console.log("Edit pelanggan");
      console.log(plg);
    };

    $scope.edit = function(trans){
      $scope.trans = trans;
      $scope.editMode = true;
    };

    $scope.injectIndex = function(trans){
      var index = $scope.trans.indexOf(trans);
      $scope.trans = trans;
    };

    $scope.showAllTransaksi();
  }])
;
