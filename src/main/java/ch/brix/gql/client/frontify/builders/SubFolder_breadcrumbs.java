package ch.brix.gql.client.frontify.builders;

public class SubFolder_breadcrumbs extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.Breadcrumb>> {
  public SubFolder_breadcrumbs() {
    super(new ch.brix.gql.client.Call<>("breadcrumbs", "Breadcrumb"));
  }
  public SubFolder_breadcrumbs onBreadcrumb(On_Breadcrumb typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
