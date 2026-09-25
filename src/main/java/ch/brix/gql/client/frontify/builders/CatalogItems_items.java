package ch.brix.gql.client.frontify.builders;

public class CatalogItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.Catalog>> {
  public CatalogItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "Catalog"));
  }
  public CatalogItems_items onCatalog(On_Catalog typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
