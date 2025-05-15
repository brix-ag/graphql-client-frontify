package ch.brix.gql.client.frontify.input_objects;

public class CancelExportCreativesInput extends ch.brix.gql.client.InputObject {
  /**
   * List of `CreativeJob` Ids that should be canceled.
   */
  public CancelExportCreativesInput ids(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("ids", v);
    return this;
  }
}
