package ch.brix.gql.client.frontify.builders;

public class RootMutation_uploadFile_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `UploadFile` input argument.
   * Default value: null
   */
  public RootMutation_uploadFile_Args input(ch.brix.gql.client.frontify.input_objects.UploadFileInput value) {
    _add_arg("input", value);
    return this;
  }
}
