<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@ taglib prefix='c' uri='http://java.sun.com/jstl/core_rt' %>

<%
String url = request.getRequestURL().toString();
String uri = request.getRequestURI();
String website =url.substring(0, url.indexOf(uri));
String request_path = website+request.getContextPath();
	String image_path = request_path + "/images/blue-themes";
	String css_path = request_path + "/css/blue-themes";
	String js_path = request_path + "/js";
	request.setAttribute("request_path", request_path);
	request.setAttribute("image_path", image_path);
	request.setAttribute("css_path", css_path);
	request.setAttribute("js_path", js_path);
	
	// 本页左侧菜单位置
	request.setAttribute("cur_menu","menu_index");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title><c:out value="${newItem.title}"/></title>

<link rel="stylesheet" type="text/css" href="${css_path}/common.css"/>
<link rel="stylesheet" type="text/css" href="${css_path}/news_detail.css"/>
<script language="JavaScript" type="text/javascript" src="${js_path}/jquery.js"></script>
<script language="JavaScript" type="text/javascript" src="${js_path}/etUtil.js"></script>
<script language="JavaScript" type="text/javascript">

</script>

</head>

<body>
<div id="fade" class="black_overlay"></div>
<div class="container">
<jsp:include page="../top.jsp"></jsp:include>
<jsp:include page="../nav.jsp"></jsp:include>

<div id="content">
	<h1 class="news_title">《支付使用协议》</h1>

	<div class="news_content">
	<p>“支付服务”（以下简称本服务）是由${sitename}软件技术发展有限公司（以下简称本公司）向支付用户提供的“支付”软件系统（以下简称本系统）及(或)附随的货款代收代付的中介服务。本协议由您和本公司签订。</p>

<p>一、 声明与承诺</p>
（一） 您确认，在您注册成为支付用户以接受本服务之前，你已充分阅读、理解并接受本协议的全部内容，一旦您使用本服务，即表示您同意遵循本协议之所有约定。<br/>
（二） 您同意，本公司有权随时对本协议内容进行单方面的变更，并以在本网站公告的方式予以公布，无需另行单独通知您；若您在本协议内容公告变更后继续使用本服务的，表示您已充分阅读、理解并接受修改后的协议内容，也将遵循修改后的协议内容使用本服务；若您不同意修改后的协议内容，您应停止使用本服务。<br/>
（三） 您声明，在您同意接受本协议并注册成为支付用户时，您是具有法律规定的完全民事权利能力和民事行为能力，能够独立承担民事责任的自然人、法人或其他组织；本协议内容不受您所属国家或地区的排斥。不具备前述条件的，您应立即终止注册或停止使用本服务。<br/>

<p>二、 “支付服务”概要</p>
（一） “支付账户”：指在您使用本服务时，本公司向您提供的唯一编号。您可自行设置密码，并用以查询或计量您的预付、应收或应付款。<br/>

（二） 货到付款服务：是指买卖双方使用本系统，且约定买卖合同项下的交易货款由买方在收到交易货物时以现金方式支付到物流公司，物流公司在收到该款项后将交易货款支付给本公司，再由本公司支付至卖方支付账户的一种支付方式。在您使用本项服务时，除适用支付中介服务的相关约定外，还将优先适用以下条款：
1、 本公司为您代收的交易货款系由您的交易对方通过物流公司提供给本公司，并通过本公司支付到您的支付账户内。您理解并同意，您的交易对方通过物流公司将现金提供本公司的过程是需要一定时间的，本公司将在物流公司收取的现金交付给本公司后的次日，向您支付交易货款，因此产生的交易款项流转时间是您明知且认可的。
2、 本公司为您代付的交易货款系由您收到交易货物后以现金方式提供给物流公司，物流公司转交给本公司后后代您充值到您的支付账户，然后代为支付到您的交易对方的支付账户内；您向本公司提供的现金是由向您送达交易货物的物流公司代为转交的，物流公司可能因此向您单独收取费用，您理解并同意，该费用是物流公司基于其向您提供的转交服务所收取的，与本公司向您提供的本项服务无关。
3、 您在选用本项服务作为交易支付方式后，该支付行为能否完成取决于您提供的收货地址是否是您的交易对方所选用的物流公司可以送达的地址，在物流公司确认不可送达时，本公司将提示您重新选择本公司的其他支付方式。
4、 您在接受本项服务作为交易支付方式后，该支付行为能否完成取决于您选用的物流公司是否可将交易货物送达您的交易对方提供的收货地址，或您的交易对方提供的收货地址准确无误，或货物完全符合您与您的交易对方约定的状态。您理解并接受，您选用的物流公司不揽货、错误送达、货物被您的交易对方拒收等情形与本公司无关，且是本公司所不能预见、预防和控制的，因此所可能产生的所有损失将由您自行完全承担。
<br/>
（三） 即时到账服务：是指买卖双方使用本系统，且约定买卖合同项下的货款通过买方支付账户即时向卖方支付账户支付的一种支付方式。本公司提示您注意：该项服务一般适用于您与交易对方彼此都有充分信任的小额交易。在您与交易对方同意选择即时到账服务支付货款时，您所支付的款项将立刻进入交易对方的支付账户，本公司对此不提供中介服务。基于可能存在的风险，在使用即时到账服务支付交易货款之前时，您理解并接受：
1、 为控制可能存在的风险，本公司对所有用户使用即时到账服务支付交易货款时的每天交易最高限额以及每笔交易最高限额进行了限制。
2、 使用即时到账服务支付货款是基于您对交易对方的充分信任，一旦您选用该方式，相对应的交易将不受本协议所有交易保护条款的保障，您将自行承担所有交易风险并自行处理所有相关的交易及货款纠纷。

<p>三、 支付账户</p>
（一） 注册相关
在使用本服务前，您必须先行注册，取得本公司提供给您的“支付账户”（以下简称该账户），您同意：
1、 依本服务注册表之提示准确提供并在取得该账户后及时更新您的正确、最新及完整的资料。若有合理理由怀疑您提供的资料错误、不实、过时或不完整的，本公司有权暂停或终止向您提供部分或全部“支付服务”。本公司对此不承担任何责任，您将承担因此产生的任何直接或间接支出。
2、 因您未及时更新资料，导致本服务无法提供或提供时发生任何错误，您不得将此作为取消交易、拒绝付款的理由，您将承担因此产生的一切后果，本公司不承担任何责任。
3、 您应对您的支付账户负责，只有您本人可以使用您的支付账户，该账户不可转让、不可赠与、不可继承。在您决定不再使用该账户时，您应将该账户下所对应的可用款项全部提现或者向本公司发出其它支付指令，并向本公司申请注销（永久冻结）该账户。
您同意，若您丧失全部或部分民事权利能力或民事行为能力，本公司有权根据有效法律文书（包括但不限于生效的法院判决、生效的遗嘱等）处置与您的支付账户相关的款项。
<br/>
（二） 账户安全
您将对使用该账户及密码进行的一切操作及言论负完全的责任，您同意：
1、本公司通过您的用户名和密码识别您的指示，请您妥善保管您的用户名和密码，对于因密码泄露所致的损失，由您自行承担。您保证不向其他任何人泄露该账户及密码，亦不使用其他任何人的“支付账户”及密码。
2、 如您发现有他人冒用或盗用您的账户及密码或任何其他未经合法授权之情形时，应立即以有效方式通知本公司，要求本公司暂停相关服务。同时，您理解本公司对您的请求采取行动需要合理期限，在此之前，本公司对已执行的指令及(或)所导致的您的损失不承担任何责任。
3、 交易异常处理：您使用本服务时，可能由于银行本身系统问题、银行相关作业网络连线问题或其他不可抗拒因素，造成本服务无法提供。您确保您所输入的您的资料无误，如果因资料错误造成本公司于上述异常状况发生时，无法及时通知您相关交易后续处理方式的，本公司不承担任何损害赔偿责任。
4、 您同意，基于运行和交易安全的需要,本公司可以暂时停止提供或者限制本服务部分功能,或提供新的功能,在任何功能减少、增加或者变化时,只要您仍然使用本服务,表示您仍然同意本协议或者变更后的协议。
	
	</div>
	<div class="back"><a href="javascript:window.close()">关闭本窗口</a></div>
</div>
	

<jsp:include page="../bottom.jsp"></jsp:include>

</div>
</body>
</html>