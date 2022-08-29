
<p class="lead">Shop Name</p>
<div class="list-group">

	<c:forEach items="${categories}" var="category">
		<a href="${contextRoot}/show/category/${category.id}/products"
			class="list-group-item" id="a_${category.name}">${category.name}</a>
	</c:forEach>
	<span class="position-absolute top-0 start-100 translate-middle p-2 bg-info border border-light rounded-circle">
		<span class="visually-hidden">${category.name}</span>
	</span>

</div>