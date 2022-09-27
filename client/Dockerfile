FROM node:16-alpine

# Create app directory
WORKDIR /app/client

# Install app dependencies
# A wildcard is used to ensure both package.json AND package-lock.json are copied
# where available (npm@5+)
COPY package.json .
#COPY package-lock.json .

RUN npm install --force

#RUN npm i --force
# If you are building your code for production
# RUN npm ci --only=production

# Bundle app source
COPY . .


EXPOSE 3000

#CMD [ "npm", "start", "--prefix", "src/main/java/hello/world/demo/view/react-project/"]
RUN npm run build
RUN npm install -g serve
CMD ["serve", "-s", "build"]
