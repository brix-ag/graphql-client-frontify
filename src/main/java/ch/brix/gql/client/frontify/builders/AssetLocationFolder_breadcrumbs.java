package ch.brix.gql.client.frontify.builders;

public class AssetLocationFolder_breadcrumbs extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.Breadcrumb>> {
  public AssetLocationFolder_breadcrumbs() {
    super(new ch.brix.gql.client.Call<>("breadcrumbs", "Breadcrumb"));
  }
  public AssetLocationFolder_breadcrumbs onBreadcrumb(On_Breadcrumb typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
