package com.example.obspringsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/saludo")
    public String Saludo(){
        return "Bienvenido BLANKARDO";

    }

    @GetMapping("/bootstrap")
    public String bootstrap(){

       return """
               <!DOCTYPE html>
               <html lang="en">
                 <head>
                   <meta charset="utf-8" />
                   <meta name="viewport" content="width=device-width, initial-scale=1" />
                   <link
                     href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
                     rel="stylesheet"
                   />
                   <link
                     href="https://getbootstrap.com/docs/5.2/assets/css/docs.css"
                     rel="stylesheet"
                   />
                   <title>Bootstrap Example</title>
                   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
                 </head>
                 <body class="p-3 m-1 border-0 bd-example">
                   <!-- Example Code -->
                              
                   <nav class="navbar navbar-dark bg-dark fixed-top">
                     <div class="container-fluid">
                       <a class="navbar-brand" href="#">PORTFOLIO</a>
                       <button
                         class="navbar-toggler"
                         type="button"
                         data-bs-toggle="offcanvas"
                         data-bs-target="#offcanvasDarkNavbar"
                         aria-controls="offcanvasDarkNavbar"
                       >
                         <span class="navbar-toggler-icon"></span>
                       </button>
                       <div
                         class="offcanvas offcanvas-end text-bg-dark"
                         tabindex="-1"
                         id="offcanvasDarkNavbar"
                         aria-labelledby="offcanvasDarkNavbarLabel"
                       >
                         <div class="offcanvas-header">
                           <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">
                             Marcos Urrea Soria
                           </h5>
                           <button
                             type="button"
                             class="btn-close btn-close-white"
                             data-bs-dismiss="offcanvas"
                             aria-label="Close"
                           ></button>
                         </div>
                         <div class="offcanvas-body">
                           <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                             <li class="nav-item">
                               <a class="nav-link active" aria-current="page" href="/conoceme"
                                 >Conóceme</a
                               >
                             </li>
                             <li class="nav-item">
                               <a class="nav-link" href="#">Contacto</a>
                             </li>
                             <li class="nav-item dropdown">
                               <a
                                 class="nav-link dropdown-toggle"
                                 href="#"
                                 role="button"
                                 data-bs-toggle="dropdown"
                                 aria-expanded="false"
                               >
                                 Mis trabajos
                               </a>
                               <ul class="dropdown-menu dropdown-menu-dark">
                                 <li><a class="dropdown-item" href="#">Web Gymnasio</a></li>
                                 <li>
                                   <a class="dropdown-item" href="#">Web Empresa Inventario</a>
                                 </li>
                                 <li>
                                   <hr class="dropdown-divider" />
                                 </li>
                               </ul>
                             </li>
                           </ul>
                         </div>
                       </div>
                     </div>
                   </nav>
                              
                   <!-- End Example Code -->
                   
                   
                   
                 </body>
               </html>
                              
                              
               """;

    }

    @GetMapping("/conoceme")
    public String conoceme(){

        return """
                 
                 <!DOCTYPE html>
                  <html lang="en">
                    <head>
                      <meta charset="utf-8" />
                      <meta name="viewport" content="width=device-width, initial-scale=1" />
                      <link
                        href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
                        rel="stylesheet"
                      />
                      <link
                        href="https://getbootstrap.com/docs/5.2/assets/css/docs.css"
                        rel="stylesheet"
                      />
                      <title>Bootstrap Example</title>
                      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
                    </head>
                    <body class="p-3 m-1 border-0 bd-example">
                      <!-- Example Code -->
                  
                      <nav class="navbar navbar-dark bg-dark fixed-top">
                        <div class="container-fluid">
                          <a class="navbar-brand" href="#">PORTFOLIO</a>
                          <button
                            class="navbar-toggler"
                            type="button"
                            data-bs-toggle="offcanvas"
                            data-bs-target="#offcanvasDarkNavbar"
                            aria-controls="offcanvasDarkNavbar"
                          >
                            <span class="navbar-toggler-icon"></span>
                          </button>
                          <div
                            class="offcanvas offcanvas-end text-bg-dark"
                            tabindex="-1"
                            id="offcanvasDarkNavbar"
                            aria-labelledby="offcanvasDarkNavbarLabel"
                          >
                            <div class="offcanvas-header">
                              <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">
                                Marcos Urrea Soria
                              </h5>
                              <button
                                type="button"
                                class="btn-close btn-close-white"
                                data-bs-dismiss="offcanvas"
                                aria-label="Close"
                              ></button>
                            </div>
                            <div class="offcanvas-body">
                              <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                                <li class="nav-item">
                                  <a class="nav-link active" aria-current="page" href="/bootstrap"
                                    >Inicio</a
                                  >
                                </li>
                                <li class="nav-item">
                                  <a class="nav-link" href="#">Contacto</a>
                                </li>
                                <li class="nav-item dropdown">
                                  <a
                                    class="nav-link dropdown-toggle"
                                    href="#"
                                    role="button"
                                    data-bs-toggle="dropdown"
                                    aria-expanded="false"
                                  >
                                    Mis trabajos
                                  </a>
                                  <ul class="dropdown-menu dropdown-menu-dark">
                                    <li><a class="dropdown-item" href="#">Web Gymnasio</a></li>
                                    <li>
                                      <a class="dropdown-item" href="#">Web Empresa Inventario</a>
                                    </li>
                                    <li>
                                      <hr class="dropdown-divider" />
                                    </li>
                                  </ul>
                                </li>
                              </ul>
                            </div>
                          </div>
                        </div>
                      </nav>
                  
                      <!-- End Example Code -->
                    </body>
                  </html>
                  
                 
                """;

    }

}


