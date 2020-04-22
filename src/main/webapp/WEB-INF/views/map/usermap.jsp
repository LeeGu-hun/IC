<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ include file="/WEB-INF/views/includes/header.jsp"%>

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=47c77bec82edfee45bb2b7d5d9de36ff"></script>
      <div class="content">
        <div class="row">
          <div class="col-md-12">
            <div class="card card-plain">
              <div class="card-header">
                Google Maps
              </div>
              <div class="card-body">
                <div id="map" class="map">
                
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
   <script>
   navigator.geolocation.getCurrentPosition(function(pos) {
	    var latitude = pos.coords.latitude;
	    var longitude = pos.coords.longitude;
	   
	
		var container = document.getElementById('map');
		var options = {
			center: new kakao.maps.LatLng(latitude, longitude),
			level: 6
		};

		var map = new kakao.maps.Map(container, options);
		
		var zoomControl = new kakao.maps.ZoomControl();
		map.addControl(zoomControl, kakao.maps.ControlPosition.RIGHT);
	});
	</script>   
<%@ include file="/WEB-INF/views/includes/footer.jsp"%>