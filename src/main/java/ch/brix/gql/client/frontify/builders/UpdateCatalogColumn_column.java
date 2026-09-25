package ch.brix.gql.client.frontify.builders;

public class UpdateCatalogColumn_column extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.CatalogColumn> {
  public UpdateCatalogColumn_column() {
    super(new ch.brix.gql.client.Call<>("column", "CatalogColumn"));
  }
  public UpdateCatalogColumn_column onCatalogLinkColumn(On_CatalogLinkColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public UpdateCatalogColumn_column onCatalogTextColumn(On_CatalogTextColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public UpdateCatalogColumn_column onCatalogColumn(On_CatalogColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
