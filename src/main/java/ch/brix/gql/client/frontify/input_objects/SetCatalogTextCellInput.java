package ch.brix.gql.client.frontify.input_objects;

public class SetCatalogTextCellInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the row where the text cell is located.
   */
  public SetCatalogTextCellInput rowId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("rowId", v);
    return this;
  }
  /**
   * **BETA** The `id` of the text column where the cell is located.
   */
  public SetCatalogTextCellInput columnId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("columnId", v);
    return this;
  }
  /**
   * **BETA** The value to set in the text cell. Null or empty string clears the cell.
   */
  public SetCatalogTextCellInput value(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("value", v);
    return this;
  }
}
