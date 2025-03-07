package ch.brix.gql.client.frontify.input_objects;

public class InviteProjectUserInput extends ch.brix.gql.client.InputObject {
  /**
   * Id of the `Project` you want to invite `User` to.
   */
  public InviteProjectUserInput projectId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("projectId", v);
    return this;
  }
  /**
   * Email address of the `User` you would like to invite.
   */
  public InviteProjectUserInput email(ch.brix.gql.client.frontify.scalars.EmailScalar v) {
    values.put("email", v);
    return this;
  }
  /**
   * `Project` permission level of the `User` you are inviting.
   */
  @ch.brix.gql.client.DefaultValue("VIEW")
  public InviteProjectUserInput permission(ch.brix.gql.client.frontify.enums.ProjectPermission v) {
    values.put("permission", v);
    return this;
  }
  /**
   * Start `Date` for `User` access permission validity.
   */
  public InviteProjectUserInput validFrom(ch.brix.gql.client.frontify.scalars.DateTimeScalar v) {
    values.put("validFrom", v);
    return this;
  }
  /**
   * End `Date` for `User` access permission validity.
   */
  public InviteProjectUserInput validTo(ch.brix.gql.client.frontify.scalars.DateTimeScalar v) {
    values.put("validTo", v);
    return this;
  }
}
