package ch.brix.gql.client.frontify.input_objects;

public class CreateCatalogRowInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the `Catalog` in which to create the row.
   */
  public CreateCatalogRowInput catalogId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("catalogId", v);
    return this;
  }
  /**
   * **BETA** The position of the new `CatalogRow`.
   */
  public CreateCatalogRowInput position(ch.brix.gql.client.frontify.scalars.IntScalar v) {
    values.put("position", v);
    return this;
  }
  /**
   * **BETA** Cells to set on the new `CatalogRow`; each entry is either a `text` or a `link` cell. When the `Catalog` has a primary column, exactly one `text` cell must target it with a non-empty value.
   */
  @ch.brix.gql.client.DefaultValue("[]")
  public CreateCatalogRowInput cells(java.util.List<ch.brix.gql.client.frontify.input_objects.CreateCatalogRowCellInput> v) {
    values.put("cells", v);
    return this;
  }
}
