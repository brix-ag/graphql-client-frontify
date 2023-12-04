package ch.brix.gql.client.frontify.input_objects;

public class DeleteCollectionInput extends ch.brix.gql.client.InputObject {
  /**
   * `Collection` Id.
   */
  public DeleteCollectionInput collectionId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("collectionId", v);
    return this;
  }
}
