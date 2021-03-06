<%-- 
    Document   : register
    Created on : Nov 15, 2019, 1:32:24 PM
    Author     : Gustavo_Meza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Regístrate</title>

        <!-- Custom fonts for this template-->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

        <!-- Custom styles for this template-->
        <link href="css/sb-admin-2.min.css" rel="stylesheet">
        <style>
            input::-webkit-outer-spin-button,
            input::-webkit-inner-spin-button {
                -webkit-appearance: none;
                margin: 0;
            }
        </style>
    </head>

    <body class="bg-myColor">

        <div class="container">

            <div class="card o-hidden border-0 shadow-lg my-5">
                <div class="card-body p-0">
                    <!-- Nested Row within Card Body -->
                    <div class="row">
                        <div class="col-lg-5 d-none d-lg-block bg-my-register-image"></div>
                        <div class="col-lg-7">
                            <div class="p-5">
                                <div class="text-center">
                                    <h1 class="h-25 text-gray-900 mb-5">Crea una cuenta!</h1>
                                </div>

                                <form class="user" method="POST" action="MainServlet?action=agregar">  
                                    <div class="form-group row">
                                        <div class="col-sm-5 ">
                                            <input required type="number" class="form-control form-control-user" name="cod" placeholder="Código">
                                        </div>
                                        <div class="col-sm-7 ">
                                            <select class="form-control form-control-sm" name="cond" >
                                                <option value="sin-condicion" selected>  -- Condicion --</option>
                                                <option value="Alumno">Alumno</option>
                                                <option value="Egresado">Egresado</option>

                                            </select>
                                            <!--<input type="email" class="form-control form-control-user" id="exampleInputCondition" placeholder="Ingrese condicion (Alumno/Egresado)">-->
                                        </div>

                                    </div>
                                    <div class="form-group row">
                                        <div class="col-sm-6 mb-3 mb-sm-0">
                                            <input type="text" class="form-control form-control-user" id="exampleFirstName" name="nombre" placeholder="Nombre">
                                        </div>
                                        <div class="col-sm-6">
                                            <input type="text" class="form-control form-control-user" id="exampleLastName" name="ap" placeholder="Apellido">
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <div class="col-sm-12">
                                            <input type="text" class="form-control form-control-user" id="exampleInputEmail" name="correo" placeholder="Correo PUCP">
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <div class="col-sm-12">
                                            <input type="password" class="form-control form-control-user" id="exampleInputPassword" name="pass" placeholder="Contraseña">
                                        </div>

                                    </div>

                                    <button type="submit" class="btn btn-myColor btn-user btn-block">
                                        Registrar Cuenta
                                    </button>

                                </form>

                                <div class="text-center">
                                    <a class="small" href="<%=request.getContextPath()%>/MainServlet?action=recuperar">Olvidé mi contraseña</a>
                                </div>
                                <div class="text-center">
                                    <a class="small" href="<%=request.getContextPath()%>/MainServlet">¿Ya tienes una cuenta? Inicia sesión!</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>

        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="js/sb-admin-2.min.js"></script>

    </body>

</html>
