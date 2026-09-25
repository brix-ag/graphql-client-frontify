package ch.brix.gql.client.frontify.builders;

public class On_CatalogLinkCell extends ch.brix.gql.client.TypeBuilder {
  public On_CatalogLinkCell() {
    super(new ch.brix.gql.client.On("CatalogLinkCell"));
  }
  /**
   * **BETA** `CatalogColumn` of the `CatalogCell`.
   */
  public On_CatalogLinkCell column(CatalogLinkCell_column callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** `CatalogRow` of the `CatalogCell`.
   */
  public On_CatalogLinkCell row(CatalogLinkCell_row callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Linked target rows and their display values for this link cell.
   */
  public On_CatalogLinkCell links(CatalogLinkCell_links callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
