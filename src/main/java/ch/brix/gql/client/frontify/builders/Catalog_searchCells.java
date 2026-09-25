package ch.brix.gql.client.frontify.builders;

public class Catalog_searchCells extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.CatalogCell>> {
  public Catalog_searchCells() {
    super(new ch.brix.gql.client.Call<>("searchCells", "CatalogCell"));
  }
  public Catalog_searchCells args(Catalog_searchCells_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Catalog_searchCells onCatalogLinkCell(On_CatalogLinkCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public Catalog_searchCells onCatalogTextCell(On_CatalogTextCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public Catalog_searchCells onCatalogCell(On_CatalogCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
