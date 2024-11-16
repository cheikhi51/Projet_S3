<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="entities.Vehicule" %>
<%@ page import="dao.VehiculeDaoImpl" %>
<%@ page import="java.util.List" %>
  <head>
    <meta charset="UTF-8" />
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />

    <!-- Boxicons CDN Link -->
    <link
      href="https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css"
      rel="stylesheet"
    />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  </head>


    <div class="sidebar">
      <div class="logo-details">
        <i class="bx bxl-c-plus-plus"></i>
        <span class="logo_name">Transport Agency</span>
      </div>
      <ul class="nav-links">
        <li>
          <a href="vehicule.do" class="active">
            <i class="bx bx-grid-alt"></i>
            <span class="links_name">Dashboard</span>
          </a>
        </li>
        <li>
          <a href="saisie.do">
            <i class="bx bx-box"></i>
            <span class="links_name">Vehicule</span>
          </a>
        </li>
        <li>
          <a href="chercher.do">
            <i class="bx bx-list-ul"></i>
            <span class="links_name">Chercher</span>
          </a>
        </li>
        <li>
          <a href="saisie.demande">
            <i class="bx bx-pie-chart-alt-2"></i>
            <span class="links_name">Demande</span>
          </a>
        </li>
        <li>
          <a href="demande.demande">
            <i class="bx bx-coin-stack"></i>
            <span class="links_name">Voyage</span>
          </a>
        </li>
        <li>
          <a href="chercher.demande">
            <i class="bx bx-book-alt"></i>
            <span class="links_name">Tout les demandes</span>
          </a>
        </li>
        <li>
          <a href="ajouterVehicule.do">
            <i class="bx bx-user"></i>
            <span class="links_name">Utilisateur</span>
          </a>
        </li>
        <!-- <li>
          <a href="#">
            <i class="bx bx-message" ></i>
            <span class="links_name">Messages</span>
          </a>
        </li>
        <li>
          <a href="#">
            <i class="bx bx-heart" ></i>
            <span class="links_name">Favrorites</span>
          </a>
        </li> -->
        <li>
          <a href="#">
            <i class="bx bx-cog"></i>
            <span class="links_name">Configuration</span>
          </a>
        </li>
        <li class="log_out">
          <a href="#">
            <i class="bx bx-log-out"></i>
            <span class="links_name">Déconnexion</span>
          </a>
        </li>
      </ul>
    </div>
    <section class="home-section">
      <nav>
        <div class="sidebar-button">
          <i class="bx bx-menu sidebarBtn"></i>
          <span class="dashboard">Dashboard</span>
        </div>
        <div class="search-box">
          <input type="text" placeholder="Recherche..." />
          <i class="bx bx-search"></i>
        </div>
        <div class="profile-details">
          <!--<img src="images/profile.jpg" alt="">-->
          <span class="admin_name">Komche</span>
          <i class="bx bx-chevron-down"></i>
        </div>
      </nav>