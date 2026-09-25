package ch.brix.gql.client.frontify.builders;

public class Catalog_cellsByPrimaryKey_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** The value to match in the catalog's primary column.
   * Default value: null
   */
  public Catalog_cellsByPrimaryKey_Args primaryKey(ch.brix.gql.client.frontify.scalars.StringScalar value) {
    _add_arg("primaryKey", value);
    return this;
  }
  /**
   * **BETA** The column IDs to fetch cell values for. The columns must belong to the catalog.
   * Default value: null
   */
  public Catalog_cellsByPrimaryKey_Args columnIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> value) {
    _add_arg("columnIds", value);
    return this;
  }
}
