package ch.brix.gql.client.frontify.input_objects;

public class UpdateCollectionDataInput extends ch.brix.gql.client.InputObject {
  /**
   * Name of the `Collection`.
   */
  public UpdateCollectionDataInput name(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("name", v);
    return this;
  }
}
