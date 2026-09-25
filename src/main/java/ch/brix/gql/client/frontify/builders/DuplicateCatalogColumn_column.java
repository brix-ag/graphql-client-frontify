package ch.brix.gql.client.frontify.builders;

public class DuplicateCatalogColumn_column extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.CatalogColumn> {
  public DuplicateCatalogColumn_column() {
    super(new ch.brix.gql.client.Call<>("column", "CatalogColumn"));
  }
  public DuplicateCatalogColumn_column onCatalogLinkColumn(On_CatalogLinkColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public DuplicateCatalogColumn_column onCatalogTextColumn(On_CatalogTextColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public DuplicateCatalogColumn_column onCatalogColumn(On_CatalogColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
