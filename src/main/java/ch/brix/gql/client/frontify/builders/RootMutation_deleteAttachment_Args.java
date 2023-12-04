package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteAttachment_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `DeleteAttachment` input argument.
   * Default value: null
   */
  public RootMutation_deleteAttachment_Args input(ch.brix.gql.client.frontify.input_objects.DeleteAttachmentInput value) {
    _add_arg("input", value);
    return this;
  }
}
