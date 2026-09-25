package ch.brix.gql.client.frontify.input_objects;

public class CatalogPropertyTypeOptionsInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `Catalog` to link to.
   */
  public CatalogPropertyTypeOptionsInput catalogId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("catalogId", v);
    return this;
  }
  /**
   * **BETA** The `CatalogColumn` to use for display values.
   */
  public CatalogPropertyTypeOptionsInput catalogDisplayColumnId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("catalogDisplayColumnId", v);
    return this;
  }
  /**
   * **BETA** Whether multiple catalog rows can be selected for this property.
   */
  @ch.brix.gql.client.DefaultValue("false")
  public CatalogPropertyTypeOptionsInput allowMultiSelect(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("allowMultiSelect", v);
    return this;
  }
  /**
   * **BETA** Link column IDs the user may traverse via link expansion.
   */
  @ch.brix.gql.client.DefaultValue("[]")
  public CatalogPropertyTypeOptionsInput allowedLinkedColumnIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("allowedLinkedColumnIds", v);
    return this;
  }
}
