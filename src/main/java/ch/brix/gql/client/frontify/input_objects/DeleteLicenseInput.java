package ch.brix.gql.client.frontify.input_objects;

public class DeleteLicenseInput extends ch.brix.gql.client.InputObject {
  /**
   * Id of the `License` to delete.
   */
  public DeleteLicenseInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
