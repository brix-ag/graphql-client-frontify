package ch.brix.gql.client.frontify.builders;

public class ClearCatalogRow_row extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CatalogRow> {
  public ClearCatalogRow_row() {
    super(new ch.brix.gql.client.Call<>("row", "CatalogRow"));
  }
  public ClearCatalogRow_row onCatalogRow(On_CatalogRow typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
