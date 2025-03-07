package ch.brix.gql.client.frontify.input_objects;

public class ReplyToCommentInput extends ch.brix.gql.client.InputObject {
  /**
   * `AssetComment` Id of the comment you want to reply to.
   */
  public ReplyToCommentInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * `AssetComment` reply content. Can include `User` mentions by wrapping an authorized `Project` `User` Id in the form of `@[user:&lt;id&gt;]` where `&lt;id&gt;` is the `User` integer or global identifier.
   */
  public ReplyToCommentInput reply(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("reply", v);
    return this;
  }
}
