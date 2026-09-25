package ch.brix.gql.client.frontify.builders;

public class On_CatalogLinkCellValue extends ch.brix.gql.client.TypeBuilder {
  public On_CatalogLinkCellValue() {
    super(new ch.brix.gql.client.On("CatalogLinkCellValue"));
  }
  /**
   * **BETA** Linked target `CatalogRow`.
   */
  public On_CatalogLinkCellValue row(CatalogLinkCellValue_row callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Display value of the linked target row.
   */
  public On_CatalogLinkCellValue displayValue() {
    _add_field("displayValue");
    return this;
  }
}
