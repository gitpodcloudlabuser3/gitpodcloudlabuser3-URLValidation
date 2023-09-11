
#!/bin/bash
cat << 'EOF' > .git/hooks/post-commit
#!/bin/bash
git push
git log -1 --shortstat > history_log.txt
EOF
chmod +x .git/hooks/post-commit
code --uninstall-extension revature-labs-non-prod.revature-angular-labs-non-prod && code --uninstall-extension hbenl.vscode-test-explorer && code --uninstall-extension ms-vscode.test-adapter-converter
code --install-extension revature-labs-non-prod.revature-labs-non-prod