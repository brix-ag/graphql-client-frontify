package ch.brix.gql.client.frontify.input_objects;

public class CreateCollectionInput extends ch.brix.gql.client.InputObject {
  /**
   * Id of the parent where you wish to create a new `Collection`. Currently supported for `Library` type parent entities only.
   */
  public CreateCollectionInput parentId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("parentId", v);
    return this;
  }
  /**
   * Name of the `Collection`.
   */
  public CreateCollectionInput name(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("name", v);
    return this;
  }
}
