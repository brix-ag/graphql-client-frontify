package ch.brix.gql.client.frontify.input_objects;

public class DeleteCommentInput extends ch.brix.gql.client.InputObject {
  /**
   * Id of the `AssetComment` to delete.
   */
  public DeleteCommentInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
