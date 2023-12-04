package ch.brix.gql.client.frontify.builders;

public class Folder_breadcrumbs extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.Breadcrumb>> {
  public Folder_breadcrumbs() {
    super(new ch.brix.gql.client.Call<>("breadcrumbs", "Breadcrumb"));
  }
  public Folder_breadcrumbs onBreadcrumb(On_Breadcrumb typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
