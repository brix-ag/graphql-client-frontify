package ch.brix.gql.client.frontify.input_objects;

public class EditCommentInput extends ch.brix.gql.client.InputObject {
  /**
   * `AssetComment` Id you wish to edit.
   */
  public EditCommentInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * `AssetComment` content to edit. Can include `User` mentions by wrapping an authorized `Project` `User` Id in the form of `@[user:<id>]` where `<id>` is the user identifier.
   */
  public EditCommentInput content(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("content", v);
    return this;
  }
}
