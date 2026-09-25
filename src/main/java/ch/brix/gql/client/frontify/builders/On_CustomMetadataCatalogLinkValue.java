package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataCatalogLinkValue extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataCatalogLinkValue() {
    super(new ch.brix.gql.client.On("CustomMetadataCatalogLinkValue"));
  }
  /**
   * **BETA** Cells readable for the linked row through custom metadata visibility.
   */
  public On_CustomMetadataCatalogLinkValue cells(CustomMetadataCatalogLinkValue_cells callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Columns readable for the linked row through custom metadata visibility.
   */
  public On_CustomMetadataCatalogLinkValue columns(CustomMetadataCatalogLinkValue_columns callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Display value of the linked row readable through custom metadata visibility.
   */
  public On_CustomMetadataCatalogLinkValue displayValue() {
    _add_field("displayValue");
    return this;
  }
}
