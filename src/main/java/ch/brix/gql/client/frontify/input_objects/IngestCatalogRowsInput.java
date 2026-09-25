package ch.brix.gql.client.frontify.input_objects;

public class IngestCatalogRowsInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the `Catalog` to ingest rows into.
   */
  public IngestCatalogRowsInput catalogId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("catalogId", v);
    return this;
  }
  /**
   * **BETA** `CatalogColumn` IDs defining the order of values in each row. The columns must all be part of the `Catalog`.
   */
  public IngestCatalogRowsInput columnIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("columnIds", v);
    return this;
  }
  /**
   * **BETA** Row values positionally aligned with `columnIds`. Each cell is a list of strings: single-valued columns use a one-element list, multi-valued columns use N elements, and an empty list clears the cell.
   */
  public IngestCatalogRowsInput rowValues(java.util.List<java.util.List<java.util.List<ch.brix.gql.client.frontify.scalars.StringScalar>>> v) {
    values.put("rowValues", v);
    return this;
  }
}
