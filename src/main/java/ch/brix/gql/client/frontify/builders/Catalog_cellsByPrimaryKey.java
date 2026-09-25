package ch.brix.gql.client.frontify.builders;

public class Catalog_cellsByPrimaryKey extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.CatalogCell>> {
  public Catalog_cellsByPrimaryKey() {
    super(new ch.brix.gql.client.Call<>("cellsByPrimaryKey", "CatalogCell"));
  }
  public Catalog_cellsByPrimaryKey args(Catalog_cellsByPrimaryKey_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Catalog_cellsByPrimaryKey onCatalogLinkCell(On_CatalogLinkCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public Catalog_cellsByPrimaryKey onCatalogTextCell(On_CatalogTextCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public Catalog_cellsByPrimaryKey onCatalogCell(On_CatalogCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
